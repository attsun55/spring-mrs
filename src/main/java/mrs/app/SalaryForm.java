package mrs.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mrs.domain.model.SalaryDto;

public class SalaryForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String kyuyoId = "";
	
	private String kintaiCd = "";
	
	private String userId = "";
	
	private String taishoY = "";

	private String taishoM = "";
	
	private String shukkinDays = "";
	
	private String  jitshudoTime = "";
	
	private String jikangai = "";
	
	private String shikyuYm = "";
	
	private String shikyuKbn = "";
	
	private String kihonKyu = "";
	
	private String syokubagai = "";
	
	private String syokunou = "";
	
	private String kazoku = "";
	
	private String lifeplan = "";
	
	private String kotsuhi = "";
	
	private String kenkoHoken = "";
	 
	private String koseiNenkin = "";
	
	private String koyoHoken = "";
	
	private String syotokuzei = "";
	
	private String jyuminzei = "";
	
	private String others = "";
	
	private String sashihikiShikyu = "";
	
	private String hurikomiShikyu = "";
	
	private String totalShikyu = "";
	
	private String totalShikyuSum = "";
	
	private String torokuYmd = "";
	
	private String koushinYmd = "";

	private List<SalaryDto> salaryDtoList = new ArrayList<SalaryDto>();
	
	public String getKyuyoId() {
		return kyuyoId;
	}

	public void setKyuyoId(String kyuyoId) {
		this.kyuyoId = kyuyoId;
	}

	public String getKintaiCd() {
		return kintaiCd;
	}

	public void setKintaiCd(String kintaiCd) {
		this.kintaiCd = kintaiCd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTaishoY() {
		return taishoY;
	}

	public void setTaishoY(String taishoY) {
		this.taishoY = taishoY;
	}

	public String getTaishoM() {
		return taishoM;
	}

	public void setTaishoM(String taishoM) {
		this.taishoM = taishoM;
	}
	
	public String getShukkinDays() {
		return shukkinDays;
	}

	public void setShukkinDays(String shukkinDays) {
		this.shukkinDays = shukkinDays;
	}

	public String getJitshudoTime() {
		return jitshudoTime;
	}

	public void setJitshudoTime(String jitshudoTime) {
		this.jitshudoTime = jitshudoTime;
	}

	public String getJikangai() {
		return jikangai;
	}

	public void setJikangai(String jikangai) {
		this.jikangai = jikangai;
	}

	public String getShikyuYm() {
		return shikyuYm;
	}

	public void setShikyuYm(String shikyuYm) {
		this.shikyuYm = shikyuYm;
	}

	public String getShikyuKbn() {
		return shikyuKbn;
	}

	public void setShikyuKbn(String shikyuKbn) {
		this.shikyuKbn = shikyuKbn;
	}

	public String getKihonKyu() {
		return kihonKyu;
	}

	public void setKihonKyu(String kihonKyu) {
		this.kihonKyu = kihonKyu;
	}

	public String getSyokubagai() {
		return syokubagai;
	}

	public void setSyokubagai(String syokubagai) {
		this.syokubagai = syokubagai;
	}

	public String getSyokunou() {
		return syokunou;
	}

	public void setSyokunou(String syokunou) {
		this.syokunou = syokunou;
	}

	public String getKazoku() {
		return kazoku;
	}

	public void setKazoku(String kazoku) {
		this.kazoku = kazoku;
	}

	public String getLifeplan() {
		return lifeplan;
	}

	public void setLifeplan(String lifeplan) {
		this.lifeplan = lifeplan;
	}

	public String getKotsuhi() {
		return kotsuhi;
	}

	public void setKotsuhi(String kotsuhi) {
		this.kotsuhi = kotsuhi;
	}

	public String getKenkoHoken() {
		return kenkoHoken;
	}

	public void setKenkoHoken(String kenkoHoken) {
		this.kenkoHoken = kenkoHoken;
	}

	public String getKoseiNenkin() {
		return koseiNenkin;
	}

	public void setKoseiNenkin(String koseiNenkin) {
		this.koseiNenkin = koseiNenkin;
	}

	public String getKoyoHoken() {
		return koyoHoken;
	}

	public void setKoyoHoken(String koyoHoken) {
		this.koyoHoken = koyoHoken;
	}

	public String getSyotokuzei() {
		return syotokuzei;
	}

	public void setSyotokuzei(String syotokuzei) {
		this.syotokuzei = syotokuzei;
	}

	public String getJyuminzei() {
		return jyuminzei;
	}

	public void setJyuminzei(String jyuminzei) {
		this.jyuminzei = jyuminzei;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getSashihikiShikyu() {
		return sashihikiShikyu;
	}

	public void setSashihikiShikyu(String sashihikiShikyu) {
		this.sashihikiShikyu = sashihikiShikyu;
	}

	public String getHurikomiShikyu() {
		return hurikomiShikyu;
	}

	public void setHurikomiShikyu(String hurikomiShikyu) {
		this.hurikomiShikyu = hurikomiShikyu;
	}

	public String getTotalShikyu() {
		return totalShikyu;
	}

	public void setTotalShikyu(String totalShikyu) {
		this.totalShikyu = totalShikyu;
	}

	public String getTotalShikyuSum() {
		return totalShikyuSum;
	}

	public void setTotalShikyuSum(String totalShikyuSum) {
		this.totalShikyuSum = totalShikyuSum;
	}

	public String getTorokuYmd() {
		return torokuYmd;
	}

	public void setTorokuYmd(String torokuYmd) {
		this.torokuYmd = torokuYmd;
	}

	public String getKoushinYmd() {
		return koushinYmd;
	}

	public void setKoushinYmd(String koushinYmd) {
		this.koushinYmd = koushinYmd;
	}

	public List<SalaryDto> getSalaryDtoList() {
		return salaryDtoList;
	}

	public void setSalaryDtoList(List<SalaryDto> salaryDtoList) {
		this.salaryDtoList = salaryDtoList;
	}
	
}	