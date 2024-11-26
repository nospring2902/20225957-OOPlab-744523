import java.util.Scanner;

public class DaysOfMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String monthInput;
        int year = -1;
        boolean validMonth = false;
        boolean validYear = false;

        while (!validMonth) {
            System.out.print("Enter a month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();
            int month = getMonthNumber(monthInput);

            if (month != -1) {
                validMonth = true;

                while (!validYear) {
                    System.out.print("Enter a year (4-digit non-negative number): ");
                    String yearInput = scanner.nextLine().trim();

                    if (isValidYear(yearInput)) {
                        year = Integer.parseInt(yearInput);
                        validYear = true;

                        int days = getDaysInMonth(month, year);
                        System.out.println("The number of days in " + getMonthName(month) + " " + year + " is: " + days);
                    } else {
                        System.out.println("Invalid year. Please enter a 4-digit non-negative number.");
                    }
                }
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }

        scanner.close();
    }

    // Kiểm tra tháng
    public static int getMonthNumber(String monthInput) {
        monthInput = monthInput.toLowerCase();

        switch (monthInput) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1;
        }
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }

    // Kiểm tra năm
    public static boolean isValidYear(String yearInput) {
        try {
            int year = Integer.parseInt(yearInput);
            return year >= 0 && yearInput.length() == 4;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    // Tính ngày trong tháng
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; 
            case 4: case 6: case 9: case 11:
                return 30; 
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    // Kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
