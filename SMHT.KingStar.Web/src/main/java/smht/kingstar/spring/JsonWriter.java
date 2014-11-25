package smht.kingstar.spring;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import net.sf.json.JSON;
import net.sf.json.JSONNull;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultValueProcessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.view.json.JsonStringWriter;
import org.springframework.web.servlet.view.json.JsonWriterConfiguratorTemplateRegistry;

import smht.kingstar.jsonlib.DateJsonValueProcessor;
import smht.kingstar.jsonlib.TimestampJsonValueProcessor;

public class JsonWriter implements JsonStringWriter {
	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public void convertAndWrite(Map model, JsonWriterConfiguratorTemplateRegistry configuratorTemplateRegistry, Writer writer, BindingResult br) throws IOException{
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes( new String[]{ "table", "schema" , "tables"} );
		jsonConfig.registerJsonValueProcessor(java.util.Date.class,new DateJsonValueProcessor());
		jsonConfig.registerJsonValueProcessor(java.sql.Timestamp.class,new TimestampJsonValueProcessor());
		jsonConfig.registerDefaultValueProcessor(java.lang.Long.class, new DefaultValueProcessor() {
			public Object getDefaultValue(Class type) {
				return JSONNull.getInstance();
			}
		});
		JSON json = JSONSerializer.toJSON(model, jsonConfig ); 
		if(logger.isDebugEnabled())
			logger.debug(json.toString());
		
		json.write(writer);
		writer.flush();
	}

}
