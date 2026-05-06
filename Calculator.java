import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private BigDecimal RX = BigDecimal.ZERO;
    private BigDecimal RY = BigDecimal.ZERO;
    private BigDecimal RM = BigDecimal.ZERO;
    private BigDecimal RZ = BigDecimal.ZERO;

    public String parseInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Invalid command";
        }
        String[] parts = input.trim().toLowerCase().split("\\s+");
        if (parts.length == 0) {
            return "Invalid command";
        }
        String cmd = parts[0];
        if (cmd.length() != 3) {
            return "Invalid command";
        }
        String rest = input.substring(cmd.length()).trim();
        switch (cmd) {
            case "mov" -> {
                String[] movOperands = rest.split(",");
                if (movOperands.length != 2) {
                    return "Invalid MOV command";
                }
                String value = movOperands[0].trim();
                String reg = movOperands[1].trim();
                return movCommand(value, reg);
            }
            case "add" -> {
                if (!rest.isEmpty()) {
                    return "Invalid ADD command";
                }
                return addCommand();
            }
            case "mul" -> {
                if (!rest.isEmpty()) {
                    return "Invalid MUL command";
                }
                return mulCommand();
            }
            case "div" -> {
                if (!rest.isEmpty()) {
                    return "Invalid DIV command";
                }
                return divCommand();
            }
            case "sub" -> {
                if (!rest.isEmpty()) {
                    return "Invalid SUB command";
                }
                return subCommand();
            }
            case "sho" -> {
                if (rest.isEmpty()) {
                    return "Invalid SHO command";
                }
                return shoCommand(rest);
            }
            case "clr" -> {
                if (rest.isEmpty()) {
                    return "Invalid CLR command";
                }
                return clrCommand(rest);
            }
            case "zmm" -> {
                if (!rest.isEmpty()) {
                    return "Invalid ZMM command";
                }
                return zmmCommand();
            }
            case "mem" -> {
                if (rest.isEmpty()) {
                    return "Invalid MEM command";
                }
                return memCommand(rest);
            }
            default -> {
                return "Invalid command";
            }
        }
    }

    private String movCommand(String value, String reg) {
        try {
            BigDecimal val = new BigDecimal(value);
            switch (reg) {
                case "rx" -> {
                    RX = val;
                    return "";
                }
                case "ry" -> {
                    RY = val;
                    return "";
                }
                case "rm" -> {
                    RM = val;
                    return "";
                }
                case "rz" -> {
                    return "Cannot move value into RZ";
                }
                default -> {
                    return "Invalid register";
                }
            }
        } catch (NumberFormatException e) {
            return "Invalid number format";
        }
    }

    private String addCommand() {
        RZ = RX.add(RY);
        return "";
    }

    private String mulCommand() {
        RZ = RX.multiply(RY);
        return "";
    }

    private String divCommand() {
        if (RY.compareTo(BigDecimal.ZERO) == 0) {
            return "Division by zero";
        }
        RZ = RX.divide(RY, 20, RoundingMode.CEILING);
        return "";
    }

    private String subCommand() {
        RZ = RX.subtract(RY);
        return "";
    }

    private String shoCommand(String reg) {
        return switch (reg) {
            case "rx" -> RX.toString();
            case "ry" -> RY.toString();
            case "rm" -> RM.toString();
            case "rz" -> RZ.toString();
            default -> "Invalid register";
        };
    }

    private String clrCommand(String reg) {
        switch (reg) {
            case "rx" -> {
                RX = BigDecimal.ZERO;
                return "";
            }
            case "ry" -> {
                RY = BigDecimal.ZERO;
                return "";
            }
            case "rm" -> {
                RM = BigDecimal.ZERO;
                return "";
            }
            case "rz" -> {
                RZ = BigDecimal.ZERO;
                return "";
            }
            default -> {
                return "Invalid register";
            }
        }
    }

    private String zmmCommand() {
        RM = RZ;
        RZ = BigDecimal.ZERO;
        return "";
    }

    private String memCommand(String reg) {
        switch (reg) {
            case "rx" -> {
                RX = RM;
                return "";
            }
            case "ry" -> {
                RY = RM;
                return "";
            }
            case "rz" -> {
                return "Cannot move memory to RZ";
            }
            default -> {
                return "Invalid register";
            }
        }
    }
}
