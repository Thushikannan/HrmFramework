package test;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddEmployeeData extends ExcelDataConfig {
    public AddEmployeeData () {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }
    @DataProvider(name = "AddEmployeeTestData")
    public Object[][] AddEmployeeTestData() {

        int rows = getRowCount("AddEmployee");
        int col = getColumnCount("AddEmployee");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddEmployee", i, j);
            }
        }
        return data;
    }
}
