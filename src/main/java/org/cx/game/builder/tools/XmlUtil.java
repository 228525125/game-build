package org.cx.game.builder.tools;

public class XmlUtil {

	public final static String Attribute_Type = "type";
	public final static String Attribute_Factory = "factory";
	public final static String Attribute_Interface = "interface";
	public final static String Attribute_Collection = "collection";
	public final static String Attribute_Map = "map";
	public final static String Attribute_Delayed = "delayed";
	
	public final static String Attribute_Value_Int = "int";
	public final static String Attribute_Value_Str = "str";
	public final static String Attribute_Value_Double = "double";
	public final static String Attribute_Value_Bool = "bool";
	
	public final static String Element_FactoryMethodParameter = "factoryMethodParameter";
	public final static String Element_Parameter = "parameter";
	public final static String Element_Key = "key";
	public final static String Element_Value = "value";
	
	/**
	 * 判断是否为基本类型，增加string为基本类型
	 * @param clz
	 * @return
	 */
	public static boolean isWrapClass(Class clz) { 
        try {
           if(clz.equals(String.class))
        	   return true;
           return ((Class) clz.getField("TYPE").get(null)).isPrimitive();
        } catch (Exception e) { 
            return false; 
        }
    }
	
	/**
	 * 首字大写
	 * @param s
	 * @return
	 */
	public static String toUpperCaseFirstOne(String s){
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }
}
