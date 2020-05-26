package test;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class ReportAddData extends ExcelDataConfig {
    public ReportAddData () {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }
    @DataProvider(name = "AddReport")
    public Object[][] AddReport() {

        int rows = getRowCount("AddReport");
        int col = getColumnCount("AddReport");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddReport", i, j);
            }
        }
        return data;
    }
}
