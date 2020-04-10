package com.contractmanagement.controle;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contractmanagement.contractadmindao.ContractAdminDAO;
import com.contractmanagement.contractrequirementdao.ContractRequirementDAO;
import com.contractmanagement.roleselection1.ContractAdmin;
import com.contractmanagement.roleselection1.ContractRequirement;
import com.contractmanagement.roleselection1.Status;
import com.contractmanagement.roleselection1.SupplierProposal;
import com.contractmanagement.supplierproposaldao.SupplierProposaldao;

@Controller
public class ContractMain {
	@Autowired
	ContractAdminDAO dao;
	@Autowired
	ContractAdmin contractAdmin;
	@Autowired
	ContractRequirement requirement;
	@Autowired
	ContractRequirementDAO dao1;
	@Autowired
	SupplierProposal pro;
	@Autowired
	SupplierProposaldao dao2;
	int id;
	String password; 
	String msgr="your data has been submitted successfully";

	/*
	 * @RequestMapping("/hello") public String redirect() { return "supplier"; }
	 */
@RequestMapping("/contractform")
public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String contactnumber = request.getParameter("contactnumber");
	int supplierid = Integer.parseInt(request.getParameter("supplierid"));
	String password = request.getParameter("password");
    com.contractmanagement.roleselection1.ContractAdmin admin=new ContractAdmin(fname,lname,age,gender,contactnumber,supplierid,password);
	int res = dao.save(admin);
	if (res > 0) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contractadmin");
		mv.addObject("msg",msgr);
		return mv;
	}
	else
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contractadmin");
		return mv;
	}
}

	@RequestMapping("/contract")
	public String Contract() {
		return "contractadmin";
	}
	@RequestMapping("/contractlogin")
	public String ContractLogin() {
		return "contractadminlogin";
	}
	@RequestMapping("/contractdata")
	public String ContractData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int id1=Integer.parseInt(request.getParameter("id"));
		dao.read(id1);
		String ss="you have logged in successfully";
		String password1=request.getParameter("password");
		
		//com.contractmanagement.roleselection1.ContractAdmin contractAdmin=new com.contractmanagement.roleselection1.ContractAdmin();
		System.out.println(id1);
		System.out.println(password1);
		System.out.println(id);
		System.out.println(password);
		if(id1==contractAdmin.getSupplierId()&&password1.equalsIgnoreCase(contractAdmin.getPassword()))
		{
			System.out.println("hai");
			//m.addAttribute("msg",ss);
			return "contractadmincreatelink";
		}
		else
		{
			System.out.println("bye");
			m.addAttribute("msg","enter the valid details");
			return "contractadminlogin";
		}
	}
	public void ContractAdminDataInformation(int id,String password)
	{
		this.id=id;
		this.password=password;
	}
	@RequestMapping("/requirementpage")
	public String RequirementPage()
	{
		return "contractadminrequirementpage";
	}
	@RequestMapping("/requirementdata")
	public String RequirementData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int id=Integer.parseInt(request.getParameter("Requirementid"));
		String type=request.getParameter("Requirementtype");
		String description=request.getParameter("Requirementdescription");
		//dao.read(id1);
		String ss="you have logged in successfully";
		String date=request.getParameter("Deliverydate");
		requirement.setRequirementid(id);
		requirement.setRequirementtype(type);
		requirement.setRequirementdescription(description);
		requirement.setDate(date);
		int res = dao1.save(requirement);
		if (res > 0) {
			m.addAttribute("msg","your data has been submitted successfully");
			return "contractadminrequirementpage";
		}
		else
		{
			return "contractadminrequirementpage";

		}
	}
	@RequestMapping("/viewrequirements")    
    public String viewreq(Model m){    
        List<ContractRequirement> list=dao1.listAll();    
        m.addAttribute("list",list);  
        return "requirementpage";    
    }    
	@RequestMapping("/viewproposals")    
    public String viewpro(Model m){    
        List<SupplierProposal> list=dao2.listAll();    
        m.addAttribute("list",list);  
        return "viewproposal";    
    }  
	@RequestMapping("/approved")    
    public String viewapp(){    
        return "approved";    
    }  
	@RequestMapping("/approveddata")
	public String approvedData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int id=Integer.parseInt(request.getParameter("requirementid"));
		String ss="Approved";
		int res = dao.saveapprove(id,ss);
		if (res > 0) {
			m.addAttribute("msg","your data has been submitted successfully");
			return "approved";
		}
		else
		{
			return "approved";

		}
	}
	@RequestMapping("/rejected")    
    public String viewrej(){    
        return "rejected";    
    }  
	@RequestMapping("/rejecteddata")
	public String rejectedData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int id=Integer.parseInt(request.getParameter("requirementid"));
		String ss="rejected";
		int res = dao.saveapprove(id,ss);
		if (res > 0) {
			m.addAttribute("msg","your data has been submitted successfully");
			return "rejected";
		}
		else
		{
			return "rejected";

		}
	}
	@RequestMapping("/revisit1")    
    public String viewrev(){    
        return "revisit";    
    }
	@RequestMapping("/revisitdata")
	public String revisitData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int id=Integer.parseInt(request.getParameter("requirementid"));
		String ss=request.getParameter("status");
		int res = dao.update(id,ss);
		if (res > 0) {
			m.addAttribute("msg","your data has been changed");
			return "revisit";
		}
		else
		{
			return "revisit";

		}
	}
	@RequestMapping("/viewstatus")    
    public String viewstatus(){    
        return "viewstatus";    
    }
	@RequestMapping("/statusdata")    
    public String viewstatusdata(HttpServletRequest request, HttpServletResponse response,Model m){
		int id=Integer.parseInt(request.getParameter("requirementid"));
		 List<Status> list=dao.listAll(id);    
	        m.addAttribute("list",list);  
        return "proposalstatus";    
    }
	@RequestMapping("/report")
	public String report() {
		return "generatereport"
				+ "";
	}
}



