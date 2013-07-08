package org.utkarsh.logger.demo;
import org.apache.log4j.Logger;

public class ConsoleAppenderSample {
		static Logger logger = Logger.getLogger("chapter1.HelloWorld");
		static public void main(String[] args) {
			logger.debug("Hello world.");
		}
}
