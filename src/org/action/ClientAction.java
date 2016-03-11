package org.action;
import java.util.*;
import javax.persistence.Entity;
import org.vo.*;//++
import org.dao.*;
import org.dao.impl.*;//++
import com.opensymphony.xwork2.*;
public class ClientAction extends ActionSupport{
	private Manager manager;
	private String message;//?
	private String type;
}
