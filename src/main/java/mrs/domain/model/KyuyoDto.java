package mrs.domain.model;

import javax.persistence.Id;
import javax.persistence.Table;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
@Table(name = "kyuyo")
public class KyuyoDto {
	@Id
	@Column(name = "kintai_cd")
	private String kintaiCd;
	
	@Column(name = "kyuyo_id")
	private String kyuyoId;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "shikyu_ym")
	private int shikyuYm;
	
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

	public String getKyuyoId() {
		return kyuyoId;
	}

	public void setKyuyoId(String kyuyoId) {
		this.kyuyoId = kyuyoId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getShikyuYm() {
		return shikyuYm;
	}

	public void setShikyuYm(int shikyuYm) {
		this.shikyuYm = shikyuYm;
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

	public int getSashihikiShikyu() {
		return sashihikiShikyu;
	}

	public void setSashihikiShikyu(int sashihikiShikyu) {
		this.sashihikiShikyu = sashihikiShikyu;
	}
}