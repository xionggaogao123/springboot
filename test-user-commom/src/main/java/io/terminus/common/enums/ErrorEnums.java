package io.terminus.common.enums;

import java.util.Objects;

/**
 * Created by xionggao on 2017/5/4.
 */
public enum  ErrorEnums {

    PARAM_ERROR("1","参数错误"),
    ADD_FAIL("2","添加失败"),
    DEL_FAIL("3","删除失败"),
    UPDATE_FAIL("4","更新失败"),
    FIND_FAIL("5","查询失败");

    private final String value;
    private final String name;

    ErrorEnums(String value,String name){
        this.value = value;
        this.name = name;
    }

    public static ErrorEnums from(int value) {
        for (ErrorEnums range : ErrorEnums.values()) {
            if (Objects.equals(range.value, value)) {
                return range;
            }
        }
        return null;
    }

    public String value() {
        return value;
    }
    @Override
    public String toString() {
        return name;
    }



}
