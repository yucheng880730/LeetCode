package Excel_Sheet_Column_Title;

// 850 => ABR
public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {

        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char)(columnNumber % 26 + 'A');
            columnNumber = columnNumber / 26;
            ans.append(ch);
        }
        ans.reverse();
        System.out.println(ans.toString());
        return ans.toString();
    }
}
