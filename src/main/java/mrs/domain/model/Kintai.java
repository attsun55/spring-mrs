package mrs.domain.model;

import javax.persistence.Id;
import javax.persistence.Table;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
@Table(name = "kintai")
public class Kintai {
	@Id
	@Column(name = "kintai_cd")
	private String kintaiCd;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "taisho_ym")
	private int taishoYm;
	
	@Column(name = "shukkin_days")
	private int shukkinDays;
	
	@Column(name = "jitsudo_time")
	private float jitsudoTime;
	
	@Column(name = "jikangai")
	private float jikangai;
	
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
	public int getTaishoYm() {
		return taishoYm;
	}
	public void setTaishoYm(int taishoYm) {
		this.taishoYm = taishoYm;
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

}