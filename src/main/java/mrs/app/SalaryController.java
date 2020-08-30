package mrs.app;

import java.awt.geom.Rectangle2D;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mrs.domain.dao.KyuyoDao;
import mrs.domain.model.KintaiDto;
import mrs.domain.model.KyuyoDto;
import mrs.domain.model.SalaryDto;
import mrs.domain.service.KintaiService;
import mrs.domain.service.KyuyoService;
import mrs.domain.service.TermService;

@Controller
@RequestMapping("salary")
public class SalaryController {

	@Autowired
	TermService termService;

	@Autowired
	KintaiService kintaiService;

	@Autowired
	KyuyoService kyuyoService;
	
	@Autowired
	KyuyoDao kyuyoDao;
	
//	@ModelAttribute
//	private SalaryForm setSalaryFom() {
//
//		SalaryForm form = new SalaryForm();
//		
//		return form;
//		
//	}
//	
	/**
	 * 表示
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "view")
	public String view(Model model) {

		List<KintaiDto> kintai = kintaiService.findKintai("01", 2020);

		KyuyoDto kyuyo = kyuyoService.findKyuyo("91");
		
		List<SalaryDto> salaryList = kyuyoService.findSalary("01", 2020);		
		
		
		String test = "aaaaa";
		model.addAttribute(test);
		model.addAttribute("test", test);
		
		SalaryForm salaryForm = new SalaryForm();

		salaryForm.setSalaryDtoList(salaryList);
				
		model.addAttribute("salaryForm", salaryForm);
		
		return "salary/view";

	}

	/**
	 * 編集
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "edit")
	public String edit(Model model) {

		//
//		Kintai kintai = kintaiService.findKintai("01", 202006);

		return "salary/edit";

	}

	/**
	 * 取込み
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "import")
	public String viewImp(Model model) {

		//
//		Kintai kintai = kintaiService.findKintai("01", 202006);

		return "salary/import";

	}
	
	@RequestMapping(value = "execute_import")
	String imp(@Valid @ModelAttribute SalaryImportForm importForm, BindingResult result)
			throws InvalidPasswordException, IOException {		
		
		String uploadDir = "C:\\tmp\\";
		
    	File uploadFile = new File(uploadDir + importForm.getImp_file().getOriginalFilename());
        try {
            // アップロードファイルを置く
        	//File uploadFile = new File(uploadDir + importForm.getImp_file().getName());
            byte[] bytes = importForm.getImp_file().getBytes();
            BufferedOutputStream uploadFileStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
            uploadFileStream.write(bytes);
            uploadFileStream.close();

//            return "You successfully uploaded.";
        } catch (Exception e) {
            // 異常終了時の処理
        } catch (Throwable t) {
            // 異常終了時の処理
        }		

//		File file = new File("C:\\tmp\\20200630.pdf");
		String password = "bm0GopkB";
        
//		PDDocument document = PDDocument.load(file, password);
		PDDocument document = PDDocument.load(uploadFile, password);
		
		System.out.println("総ページ数：" + document.getNumberOfPages());

		// 取得する店舗一覧のページ
		int pageNo = 0;

		PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		stripper.setSortByPosition( true );
		
		double x = 37.0;
        double y = 115.05;
        double w = 513.58;
        double h = 671.47;
        Rectangle2D rect = new Rectangle2D.Double(x, y, w, h);
		
		stripper.addRegion( "row1column1", rect );
//		List allPages = document.getPage(pageNo);
		PDPage page= document.getPage(pageNo);
		stripper.extractRegions( page );
		
		String text = stripper.getTextForRegion( "row1column1" );
		
		KintaiDto kintai = new KintaiDto();
		
		KyuyoDto kyuyoDto = new KyuyoDto();
		
        String lines[]= text.split("\\r?\\n");
        String word_pref = "";
        for (String line : lines) {
//            System.out.println(line);
        	
            String[] words = line.split(" ");
            for (String word : words) {
//                System.out.println(word);
                
                // 給与
//				if (check("給与対象年月", word_pref)) {
//					String date = word.substring(0, 8);
//					System.out.println("給与日付：" + word);
//				}
//				if (check("賞与対象年月", word_pref)) {
//					String date = word.substring(0, 8);
//					System.out.println("賞与日付：" + word);
//				}
				
//                if(word_pref .equals("振込支給額1")) {
//                    System.out.println(word_pref + " : " + word);
//                }
            	
            	// 給与
                if(word_pref .equals("総支給額")) {
                	kyuyoDto.setTotalShikyu(Integer.parseInt(word.replace(",", "")));
                    System.out.println(word_pref + " : " + word);
                }
                // 賞与
				if (word_pref.equals("総支給額 ")) {
                	kyuyoDto.setTotalShikyu(Integer.parseInt(word.replace(",", "")));
					System.out.println(word_pref + " : " + word);
				}
				if (word_pref.equals("賞振込支給額1")) {	
                	kyuyoDto.setHurikomiShikyu(Integer.parseInt(word.replace(",", "")));
					System.out.println(word_pref + " : " + word);
				}
                
				// 前行を保持
                word_pref = word;
            }
        }		
		document.close();
		
		// ファイル削除
		uploadFile.delete();
        int cnt = kyuyoDao.insertKyuyo(kyuyoDto);
        
		
		return "salary/import";

	}	
	
	
	/**
	 * 登録
	 * 
	 * @param form
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@Validated SalaryForm form, BindingResult result) {

		// 給与
		SalaryDto salaryDto = new SalaryDto();
		// 勤怠
		KintaiDto kintaiDto = new KintaiDto();
		// 給与
		KyuyoDto kyuyoDto = new KyuyoDto();

		// 勤怠
		// ユーザーID
		kintaiDto.setUserId(form.getUserId());
		// 対象年月
		kintaiDto.setTaishoM(Integer.parseInt(form.getTaishoM()));
		// 出勤日数
		kintaiDto.setShukkinDays(Integer.parseInt(form.getShukkinDays()));
		// 実働時間
		kintaiDto.setJitsudoTime(Integer.parseInt(form.getJitshudoTime()));
		// 時間外労働
		kintaiDto.setJikangai(Integer.parseInt(form.getJikangai()));
		// 登録年月日
		kintaiDto.setTorokuYmd(Double.parseDouble(form.getTorokuYmd()));
		// 更新年月日
		kintaiDto.setKoushinYmd(Double.parseDouble(form.getKoushinYmd()));

		// 給与
		// 支給年月
		kyuyoDto.setShikyuM(Integer.parseInt(form.getShikyuYm()));
		// 支給区分
		kyuyoDto.setShikyuKbn(Integer.parseInt(form.getJitshudoTime()));
		// 基本給
		kyuyoDto.setKihonKyu(Integer.parseInt(form.getKintaiCd()));
		// 職場外手当
		kyuyoDto.setSyokubagai(Integer.parseInt(form.getSyokubagai()));
		// 職能手当
		kyuyoDto.setSyokunou(Integer.parseInt(form.getSyokunou()));
		// 家族手当
		kyuyoDto.setKazoku(Integer.parseInt(form.getKazoku()));
		// ﾗｲﾌﾌﾟﾗﾝ給
		kyuyoDto.setLifeplan(Integer.parseInt(form.getLifeplan()));
		// 通勤支給
		kyuyoDto.setKotsuhi(Integer.parseInt(form.getKotsuhi()));

		// 健康保険料
		kyuyoDto.setKenkoHoken(Integer.parseInt(form.getKenkoHoken()));
		// 構成年金
		kyuyoDto.setKoseiNenkin(Integer.parseInt(form.getKoseiNenkin()));
		// 雇用保険
		kyuyoDto.setKoyoHoken(Integer.parseInt(form.getKoyoHoken()));
		// 所得税
		kyuyoDto.setSyotokuzei(Integer.parseInt(form.getSyotokuzei()));
		// 住民税
		kyuyoDto.setJyuminzei(Integer.parseInt(form.getJyuminzei()));
		// その他
		kyuyoDto.setOthers(Integer.parseInt(form.getOthers()));

		// 総支給額
		kyuyoDto.setTotalShikyu(Integer.parseInt(form.getTotalShikyu()));
//		// 差引支給額
//		kyuyoDto.setSashihikiShikyu(Integer.parseInt(form.getSashihikiShikyu()));
		// 振込支給額
		kyuyoDto.setHurikomiShikyu(Integer.parseInt(form.getHurikomiShikyu()));
//		// 総支給額累計
//		kyuyoDto.setTotalShikyuSum(Integer.parseInt(form.getTotalShikyuSum()));

		kintaiService.addKintai(salaryDto);

		return "salary/edit";

	}

	
	private boolean check(String regex, String target){

	    Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
	    
//	    System.out.print(target + " は " + p.pattern() + " に");

	    if (m.find()){
//	      System.out.println("マッチします");
	    	return true;
	    }else{
//	      System.out.println("マッチしません");
	    	return false;
	    }
	  }	
}