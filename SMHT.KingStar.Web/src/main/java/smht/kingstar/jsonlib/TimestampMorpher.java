package smht.kingstar.jsonlib;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import net.sf.ezmorph.MorphException;
import net.sf.ezmorph.object.AbstractObjectMorpher;

/**
 * 在Json中转化字符串到Bean是解决Timestamp格式数据报错问题
 * 
 * @author luwensen
 * 
 */
public class TimestampMorpher extends AbstractObjectMorpher {

	public static final String Default_DATE_PATTERN = "yyyy-MM-dd";  
    private DateFormat dateFormat;  

    /**
     * 构造方法
     * @param format 格式化字符串
     */
    public TimestampMorpher(String datePattern) {
    	this.dateFormat = new SimpleDateFormat(datePattern);
    }

    public TimestampMorpher() {
    	this.dateFormat = new SimpleDateFormat(Default_DATE_PATTERN); 
    }
    
    
    @Override
    public Object morph(Object value) {
		try {
		    String strValue;
		    strValue = (String)value;
		    if (value == null || "".equals(strValue.trim()))
		    	return null;
		    
		    if (Timestamp.class.isAssignableFrom(value.getClass()))
		    	return (Timestamp) value;
		    if (!supports(value.getClass())){
		    	return null;
		    	//throw new MorphException(value.getClass() + " is not supported");
		    }
		    
		    return new Timestamp(this.dateFormat.parse(strValue).getTime());
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return null;
    }

    @Override
    public Class<?> morphsTo() {
    	return Timestamp.class;
    }

}

