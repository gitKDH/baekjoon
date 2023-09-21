public class test3 {
    public static void main(String[] args) {
        Object[][] data = new Object[][]{
                {"AAA", 1.23456, 123456},
                {"BBBBB", 12.30, 1234},
                {"CCCC", 123.40, 12345}
        };

        printTable(data);
    }

    public static void printTable(Object[][] sample) {
        for (Object[] data : sample) {
            for (Object field : data) {
                String formatted = format(field);
                System.out.printf("| %6s ", formatted);
            }
            System.out.println("|");
        }
    }

    public static String format(Object field) {
        if (field instanceof Number) {
            double value = ((Number) field).doubleValue();
            if (value == (long) value) {
                return String.format("%6d", (long) value);
            } else {
                return String.format("%6.2f", value);
            }
        }
        return String.format("%-6s", field.toString());
    }
}
