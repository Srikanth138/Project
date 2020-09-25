/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dts.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dts.SBIBanking.dao.ChequeIssueDAO;
import com.dts.SBIBanking.model.ChequeIssueMaster;

/** 
 * MyEclipse Struts
 * Creation date: 02-26-2009
 * 
 * XDoclet definition:
 * @struts.action path="/chequeIssueAction" name="chequeIssueMaster" scope="request"
 * @struts.action-forward name="success" path="/Success1.jsp?cheque Issued Successfully"
 * @struts.action-forward name="fail" path="/Success1.jsp?status=Cheques Issued Failed"
 */
public class ChequeIssueAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try{
			ChequeIssueMaster chequeIssueMaster = (ChequeIssueMaster) form;// TODO Auto-generated method stub
		
		ChequeIssueDAO adao=new ChequeIssueDAO();
		boolean flag=adao.register(chequeIssueMaster);
		if(flag)
		{
			return mapping.findForward("success");
		}
	}catch (Exception e) {
		// TODO: handle exception
	}
	return mapping.findForward("fail");
}
}