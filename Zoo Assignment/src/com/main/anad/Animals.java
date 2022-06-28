package com.main.anad;
import com.main.about.*;
import java.util.Arrays;

import com.main.Main;
import com.main.about.Zoo_welcome;

public class Animals implements Zoo_welcome {
String[] animal= {"lion","tiger","wolf","lamb"};
public String welcome(String zooname) {
	return "welcome to "+zooname;
}
public String toString() {
	return "Animals present here are" +"["+ Arrays.toString(animal)+"]";
}
}
