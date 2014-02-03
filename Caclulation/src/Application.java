import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 * 
 */

/**
 * @author �����
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("resource/repTemp.xml");
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, new HashMap(), new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(jasperPrint,
					"resource/hello_report.pdf");
		} catch (JRException e) {
			e.printStackTrace();
		}

	}

}
