package test;


import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class LoginData extends ExcelDataConfig {
  //  private static final Logger LOGGER = Logger.getLogger(LoginData.class);
    public LoginData () {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }
    @DataProvider(name = "LoginTestData")
    public Object[][] LoginTestData() {

        int rows = getRowCount("Sheet4");
        int col = getColumnCount("Sheet4");

      //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet4", i, j);
            }
        }
        return data;
    }
}