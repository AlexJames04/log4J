package alphaPackage;

import org.apache.logging.log4j.*;

public class demo {

	private static Logger log = LogManager.getLogger(demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I'm debugging");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("I'm not a fatel");

	}
}

