package com.linknet.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import com.linknet.data.ControlName;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Translate{
	@WebMethod
	public void command(ControlName cn , String command);
}