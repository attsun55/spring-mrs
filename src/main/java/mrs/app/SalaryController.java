package mrs.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
//	@ModelAttribute
//	private SalaryForm setSalaryFom() {
//
//		SalaryForm form = new SalaryForm();
//		
//		return form;
//		
//	}
//	
	@RequestMapping(value = "view")
	public String view(Model model) {

		//
		KintaiDto kintai = kintaiService.findKintai("01", 202006);

		KyuyoDto kyuyo = kyuyoService.findKyuyo("01");
		
		
		String test = "aaaaa";
		model.addAttribute(test);
		model.addAttribute("test", test);
		
		SalaryForm salaryForm = new SalaryForm();

		salaryForm.setTaishoYm(String.valueOf(kintai.getTaishoYm()));
		salaryForm.setTotalShikyu(String.valueOf(kyuyo.getTotalShikyu()));
		salaryForm.setHurikomiShikyu(String.valueOf(kyuyo.getHurikomiShikyu()));
		
//        salaryForm.getTaishoYm();
//        salaryForm.getTotalShikyu();
//        salaryForm.getHurikomiShikyu();
//		
		
		model.addAttribute("salaryForm", salaryForm);
		
		return "salary/view";

	}

	@RequestMapping(value = "edit")
	public String edit(Model model) {

		//
//		Kintai kintai = kintaiService.findKintai("01", 202006);

		return "salary/edit";

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
		kintaiDto.setTaishoYm(Integer.parseInt(form.getTaishoYm()));
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
		kyuyoDto.setShikyuYm(Integer.parseInt(form.getShikyuYm()));
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

}