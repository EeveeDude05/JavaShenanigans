import java.util.Scanner;
public class invalidtimeexeption {
    class InvalidHourException extends Exception {
        public InvalidHourException() {
            super("invalid hour input, hours must be between 0 and 23");
        }
    }
    class InvalidMinuteException extends Exception {
        public InvalidMinuteException() {
            super("invalid minute input, minutes must be between 0 and 59");
        }
    }
    // asks the user to input the hour and minute, and throws an exception if the input is invalid
    public void setTime(int hour, int minute) throws InvalidHourException, InvalidMinuteException {
        if (hour < 0 || hour > 23) {
            throw new InvalidHourException();
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidMinuteException();
        }
        System.out.println("Time set to " + hour + ":" + (minute < 10 ? "0" + minute : minute));
        System.out.println("12-hour format: " + toTwelveHourFormat(hour, minute));
    }

    private String toTwelveHourFormat(int hour, int minute) {
        String period = hour < 12 ? "AM" : "PM";
        int convertedHour = hour % 12;
        if (convertedHour == 0) {
            convertedHour = 12;
        }
        String minuteString = minute < 10 ? "0" + minute : String.valueOf(minute);
        return convertedHour + ":" + minuteString + " " + period;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        invalidtimeexeption time = new invalidtimeexeption();

        System.out.print("Enter hour (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Enter minute (0-59): ");
        int minute = scanner.nextInt();

        try {
            time.setTime(hour, minute);
        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

