public class timeConversion {
    //InvalidHourExeption class to handle invalid hour input
    public static class InvalidHourException extends Exception {
        public InvalidHourException(String message) {
            super(message);
        }
    }

    //InvalidMinuteException class to handle invalid minute input
    public static class InvalidMinuteException extends Exception {
        public InvalidMinuteException(String message) {
            super(message);
        }
    }

    // method to convert time from 12-hour format to 24-hour format
    public static String convertTo24HourFormat(String time12) throws InvalidHourException, InvalidMinuteException {
        String[] parts = time12.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minute = parts[1].substring(0, 2);
        String amPm = parts[1].substring(2);
        
        // Validate hour and minute
        if (hour > 12) {
            throw new InvalidHourException("Hours cannot be over 12");
        }
        int minuteValue = Integer.parseInt(minute);
        if (minuteValue > 59) {
            throw new InvalidMinuteException("Minutes cannot be over 59");
        }
        
        if (amPm.equalsIgnoreCase("PM") && hour != 12) {
            hour += 12;
        } else if (amPm.equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }
        return String.format("%02d:%s", hour, minute);
    }

    public static void main(String[] args) {
        String time12 = "12:30AM";
        try {
            String time24 = convertTo24HourFormat(time12);
            System.out.println("24-hour format: " + time24);
        } catch (InvalidHourException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InvalidMinuteException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
