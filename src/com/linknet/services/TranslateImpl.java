package com.linknet.services;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jws.WebService;
import com.linknet.data.ControlName;

@WebService(endpointInterface = "com.linknet.services.Translate")
public class TranslateImpl implements Translate {
	
	static Logger webRecySys = null;
    static {
    	webRecySys = Logger.getLogger("com.linknet.webRecySys");    	
    }
	
	@Override
	public void command(ControlName cn, String command) {		
		ProcessBuilder pb = new ProcessBuilder("/usr/bin/irsend", "SEND_ONCE", cn.toString() , command);
		pb.redirectErrorStream(true);
		try {
			pb.start();
			//Process x = pb.start();
			//BufferedReader stdInput = new BufferedReader(new InputStreamReader(x.getInputStream()));
			//BufferedReader stdError = new BufferedReader(new InputStreamReader(x.getErrorStream()));
		} catch (IOException e) {
			webRecySys.log(Level.INFO, this.getClass().getSimpleName() , e.getMessage() );
		}
	}
}