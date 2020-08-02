package mrs.domain.model;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class SalaryDto {
	
	@Column(name = "kintai_cd")
	private String kintaiCd;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "taisho_y")
	private int taishoY;

	@Column(name = "taisho_m")
	private int taishoM;
	
	@Column(name = "shukkin_days")
	private int shukkinDays;
	
	@Column(name = "jitsudo_time")
	private float jitsudoTime;
	
	@Column(name = "jikangai")
	private float jikangai;
	
	@Column(name = "kyuyo_id")
	private String kyuyoId;
	
	@Column(name = "shikyu_y")
	private int shikyuY;
	
	@Column(name = "shikyu_m")
	private int shikyuM;
	
	@Column(name = "shikyu_kbn")
	private int shikyuKbn;
	
	@Column(name = "kihon_kyu")
	private int kihonKyu;
	
	@Column(name = "syokubagai")
	private int syokubagai;
	
	@Column(name = "syokunou")
	private int syokunou;
	
	@Column(name = "kazoku")
	private int kazoku;
	
	@Column(name = "lifeplan")
	private int lifeplan;
	
	@Column(name = "kotsuhi")
	private int kotsuhi;
	
	@Column(name = "kenko_hoken")
	private int kenkoHoken;
	
	@Column(name = "kosei_nenkin")
	private int koseiNenkin;
	
	@Column(name = "koyo_hoken")
	private int koyoHoken;
	
	@Column(name = "syotokuzei")
	private int syotokuzei;
	
	@Column(name = "jyuminzei")
	private int jyuminzei;
	
	@Column(name = "others")
	private int others;
	
	@Column(name = "total_shikyu")
	private int totalShikyu;
	
	@Column(name = "hurikomi_shikyu")
	private int hurikomiShikyu;
		
	@Column(name = "sashihiki_shikyu")
	private int sashihikiShikyu;	
	
	@Column(name = "toroku_ymd")
	private double torokuYmd;
	
	@Column(name = "koushin_ymd")
	private double koushinYmd;
	
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
	public int getTaishoY() {
		return taishoY;
	}
	public void setTaishoY(int taishoY) {
		this.taishoY = taishoY;
	}
	public int getTaishoM() {
		return taishoM;
	}
	public void setTaishoM(int taishoM) {
		this.taishoM = taishoM;
	}
	
	public int getShukkinDays() {
		return shukkinDays;
	}
	public void setShukkinDays(int shukkinDays) {
		this.shukkinDays = shukkinDays;
	}
	public float getJitsudoTime() {
		return jitsudoTime;
	}
	public void setJitsudoTime(float jitsudoTime) {
		this.jitsudoTime = jitsudoTime;
	}
	public float getJikangai() {
		return jikangai;
	}
	public void setJikangai(float jikangai) {
		this.jikangai = jikangai;
	}
	public double getTorokuYmd() {
		return torokuYmd;
	}
	public void setTorokuYmd(double torokuYmd) {
		this.torokuYmd = torokuYmd;
	}
	public double getKoushinYmd() {
		return koushinYmd;
	}
	public void setKoushinYmd(double koushinYmd) {
		this.koushinYmd = koushinYmd;
	}

	public String getKyuyoId() {
		return kyuyoId;
	}

	public void setKyuyoId(String kyuyoId) {
		this.kyuyoId = kyuyoId;
	}

	public int getShikyuY() {
		return shikyuY;
	}

	public void setShikyuY(int shikyuY) {
		this.shikyuY = shikyuY;
	}

	public int getShikyuM() {
		return shikyuM;
	}

	public void setShikyuM(int shikyuM) {
		this.shikyuM = shikyuM;
	}
	
	public int getShikyuKbn() {
		return shikyuKbn;
	}

	public void setShikyuKbn(int shikyuKbn) {
		this.shikyuKbn = shikyuKbn;
	}

	public int getKihonKyu() {
		return kihonKyu;
	}

	public void setKihonKyu(int kihonKyu) {
		this.kihonKyu = kihonKyu;
	}

	public int getSyokubagai() {
		return syokubagai;
	}

	public void setSyokubagai(int syokubagai) {
		this.syokubagai = syokubagai;
	}

	public int getSyokunou() {
		return syokunou;
	}

	public void setSyokunou(int syokunou) {
		this.syokunou = syokunou;
	}

	public int getKazoku() {
		return kazoku;
	}

	public void setKazoku(int kazoku) {
		this.kazoku = kazoku;
	}

	public int getLifeplan() {
		return lifeplan;
	}

	public void setLifeplan(int lifeplan) {
		this.lifeplan = lifeplan;
	}

	public int getKotsuhi() {
		return kotsuhi;
	}

	public void setKotsuhi(int kotsuhi) {
		this.kotsuhi = kotsuhi;
	}

	public int getKenkoHoken() {
		return kenkoHoken;
	}

	public void setKenkoHoken(int kenkoHoken) {
		this.kenkoHoken = kenkoHoken;
	}

	public int getKoseiNenkin() {
		return koseiNenkin;
	}

	public void setKoseiNenkin(int koseiNenkin) {
		this.koseiNenkin = koseiNenkin;
	}

	public int getKoyoHoken() {
		return koyoHoken;
	}

	public void setKoyoHoken(int koyoHoken) {
		this.koyoHoken = koyoHoken;
	}

	public int getSyotokuzei() {
		return syotokuzei;
	}

	public void setSyotokuzei(int syotokuzei) {
		this.syotokuzei = syotokuzei;
	}

	public int getJyuminzei() {
		return jyuminzei;
	}

	public void setJyuminzei(int jyuminzei) {
		this.jyuminzei = jyuminzei;
	}

	public int getOthers() {
		return others;
	}

	public void setOthers(int others) {
		this.others = others;
	}

	public int getHurikomiShikyu() {
		return hurikomiShikyu;
	}

	public void setHurikomiShikyu(int hurikomiShikyu) {
		this.hurikomiShikyu = hurikomiShikyu;
	}

	public int getTotalShikyu() {
		return totalShikyu;
	}

	public void setTotalShikyu(int totalShikyu) {
		this.totalShikyu = totalShikyu;
	}

	public int getSashihikiShikyu() {
		return sashihikiShikyu;
	}

	public void setSashihikiShikyu(int sashihikiShikyu) {
		this.sashihikiShikyu = sashihikiShikyu;
	}
	
	
}