package cn.force.coder.snow.enums;

/**
 * 状态枚举类
 *
 * @author force coder
 * @version 1.0.0
 * @since 2021/11/24
 */
public enum StatusEnum {

    /**
     * 未激活
     */
    INACTIVE(1, "未激活"),

    /**
     * 正常
     */
    NORMAL(2, "正常"),

    /**
     * 冻结
     */
    FREEZE(3, "冻结");

    private final int value;

    private final String name;

    StatusEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public static StatusEnum formatter(int value) {
        switch (value) {
            case 1:
                return INACTIVE;
            case 2:
                return NORMAL;
            case 3:
                return FREEZE;
            default:
                return null;
        }
    }

    public static StatusEnum formatter(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "未激活":
                return INACTIVE;
            case "正常":
                return NORMAL;
            case "冻结":
                return FREEZE;
            default:
                return null;
        }
    }
}
