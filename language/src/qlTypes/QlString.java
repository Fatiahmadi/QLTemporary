package qlTypes;

public class QlString extends Type{
public String value;	


public String QLString(String value) {
	this.value = value;
	return value;
}

public String getValue() {
	return value;
}
}


