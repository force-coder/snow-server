package cn.force.coder.snow.enums;

/**
 * 性别枚举类
 *
 * @author force coder
 * @version 1.0.0
 * @since 2021/11/22
 */
public enum GenderEnum {

    /**
     * 男
     */
    MALE(1, "男"),

    /**
     * 女
     */
    FEMALE(2, "女");

    private final int value;

    private final String name;

    GenderEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public static GenderEnum formatter(int value) {
        switch (value) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            default:
                return null;
        }
    }

    public static GenderEnum formatter(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "男":
                return MALE;
            case "女":
                return FEMALE;
            default:
                return null;
        }
    }
}
