/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dts.SBIBanking.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-26-2009
 * 
 * XDoclet definition:
 * @struts.form name="chequeIssueMaster"
 */
public class ChequeIssueMaster extends ActionForm {
	/*
	 * Generated fields
	 */

	/** accountno property */
	private String accountno;

	/** noofcheques property */
	private int noofcheques;

	/** fromnumber property */
	private String fromnumber;

	/** issueDate property */
	private String issueDate;

	/** loginname property */
	private String loginname;

	/** toNumber property */
	private String toNumber;

	/** chequeIssueid property */
	private int chequeIssueid;

	/** requestid property */
	private int requestid;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the accountno.
	 * @return String
	 */
	public String getAccountno() {
		return accountno;
	}

	/** 
	 * Set the accountno.
	 * @param accountno The accountno to set
	 */
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	/** 
	 * Returns the noofcheques.
	 * @return int
	 */
	public int getNoofcheques() {
		return noofcheques;
	}

	/** 
	 * Set the noofcheques.
	 * @param noofcheques The noofcheques to set
	 */
	public void setNoofcheques(int noofcheques) {
		this.noofcheques = noofcheques;
	}

	/** 
	 * Returns the fromnumber.
	 * @return String
	 */
	public String getFromnumber() {
		return fromnumber;
	}

	/** 
	 * Set the fromnumber.
	 * @param fromnumber The fromnumber to set
	 */
	public void setFromnumber(String fromnumber) {
		this.fromnumber = fromnumber;
	}

	/** 
	 * Returns the issueDate.
	 * @return String
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/** 
	 * Set the issueDate.
	 * @param issueDate The issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/** 
	 * Returns the loginname.
	 * @return String
	 */
	public String getLoginname() {
		return loginname;
	}

	/** 
	 * Set the loginname.
	 * @param loginname The loginname to set
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/** 
	 * Returns the toNumber.
	 * @return String
	 */
	public String getToNumber() {
		return toNumber;
	}

	/** 
	 * Set the toNumber.
	 * @param toNumber The toNumber to set
	 */
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}

	/** 
	 * Returns the chequeIssueid.
	 * @return int
	 */
	public int getChequeIssueid() {
		return chequeIssueid;
	}

	/** 
	 * Set the chequeIssueid.
	 * @param chequeIssueid The chequeIssueid to set
	 */
	public void setChequeIssueid(int chequeIssueid) {
		this.chequeIssueid = chequeIssueid;
	}

	/** 
	 * Returns the requestid.
	 * @return int
	 */
	public int getRequestid() {
		return requestid;
	}

	/** 
	 * Set the requestid.
	 * @param requestid The requestid to set
	 */
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
}