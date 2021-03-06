/**
 * 
 */
package cn.kunter.common.constant.type;

/**
 * 数据源类型
 * @author 阳自然
 * @version 1.0 2015年6月8日
 */
public enum SourceType {

    DB("DB"), EXCEL("Excel");

    private String value;

    private SourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
