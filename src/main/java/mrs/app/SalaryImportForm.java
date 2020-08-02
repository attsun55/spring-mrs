package mrs.app;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class SalaryImportForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MultipartFile imp_file = null;

	public MultipartFile getImp_file() {
		return imp_file;
	}

	public void setImp_file(MultipartFile imp_file) {
		this.imp_file = imp_file;
	}

}	