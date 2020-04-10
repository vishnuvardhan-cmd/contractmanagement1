package com.contractmanagement.controle;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contractmanagement.createcontractdao.CreateContractDAO;
import com.contractmanagement.roleselection1.ContractRequirement;
import com.contractmanagement.roleselection1.CreateContract;
import com.contractmanagement.roleselection1.Supplier;
import com.contractmanagement.roleselection1.SupplierProposal;
import com.contractmanagement.supplierdao.SupplierDAO;
import com.contractmanagement.supplierproposaldao.SupplierProposaldao;

@Controller
public class ControllerMain {
	@Autowired
	SupplierDAO dao;
	@Autowired
	private Supplier supplier;
	@Autowired
	private SupplierProposal porposal;
	@Autowired
	SupplierProposaldao dao1;
	@Autowired
	CreateContractDAO dao2;
	@Autowired
	CreateContract cc;
	public SupplierProposal getPorposal() {
		return porposal;
	}

	public void setPorposal(SupplierProposal porposal) {
		this.porposal = porposal;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	int id;
	String password;
	String msgr="your data has been submitted successfully";

	/*
	 * @RequestMapping("/hello") public String redirect() { return "supplier"; }
	 */
@RequestMapping("/suppform")
public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String contactnumber = request.getParameter("contactnumber");
	int supplierid = Integer.parseInt(request.getParameter("supplierid"));
	String password = request.getParameter("password");
    com.contractmanagement.roleselection1.Supplier s=new com.contractmanagement.roleselection1.Supplier(fname,lname,age,gender,contactnumber,supplierid,password);
	int res = dao.save(s);
	if (res > 0) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("supplier");
		mv.addObject("msg",msgr);
		return mv;
	}
	else
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("supplier");
		return mv;
	}
}

	@RequestMapping("/supp")
	public String Supplier() {
		return "supplier";
	}
	@RequestMapping("/main")
	public String Main() {
		return "main";
	}
	@RequestMapping("/supplogin")
	public String SupplierLogin() {
		return "supplierlogin";
	}
	@RequestMapping("/suppdata")
	public String SupplierLoginData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int id1=Integer.parseInt(request.getParameter("id"));
		dao.read(id1);
		String ss="you have logged in successfully";
		String password1=request.getParameter("password");
		
		//com.contractmanagement.roleselection1.Supplier supplier=new com.contractmanagement.roleselection1.Supplier();
		System.out.println(id1);
		System.out.println(password1);
		System.out.println(supplier.getSupplierId());
		System.out.println(supplier.getPassword());
		if(supplier.getSupplierId()==id1&&supplier.getPassword().equalsIgnoreCase(password1))
		{
			//System.out.println("hai");
			//m.addAttribute("msg",ss);
			return "supplierlink";
		}
		else
		{
			System.out.println("bye");
			m.addAttribute("msg","enter the valid details");
			return "supplierlogin";
		}
	}

	@RequestMapping("/proposaldata")
	public String ProposalData(HttpServletRequest request, HttpServletResponse response,Model m) {
		int proposalid=Integer.parseInt(request.getParameter("proposalid"));
		int requirementid=Integer.parseInt(request.getParameter("requirementid"));
		String date=request.getParameter("proposaldate");
		//dao.read(id1);
		String ss="you have logged in successfully";
		String quotation=request.getParameter("quotation");
		porposal.setProposalid(proposalid);
		porposal.setRequirementid(requirementid);
		porposal.setProposaldate(date);
		porposal.setQuotation(quotation);
		int res = dao1.save(porposal);
		if (res > 0) {
			m.addAttribute("msg","your data has been submitted successfully");
			return "createproposal";
		}
		else
		{
			return "createproposal";

		}
	}
	@RequestMapping("/about1")
	public String About()
	{
		return "about";
	}
	@RequestMapping("/contact1")
	public String Contact()
	{
		return "contact";
	}
	@RequestMapping("/proposal")
	public String Proposal()
	{
		return "createproposal";
	}
	@RequestMapping("/newcontract")
	public String NewContract()
	{
		return "createcontract";
	}
	@RequestMapping("/contractdata1")
	public String ContractData(HttpServletRequest request, HttpServletResponse response,Model m)
	{
		int id=Integer.parseInt(request.getParameter("contractid"));
		String type=request.getParameter("contracttype");
		String duration=request.getParameter("contractduration");
		cc.setContractid(id);
		cc.setContracttype(type);
		cc.setContractduration(duration);
		int res=dao2.save(cc);
		if (res > 0) {
			m.addAttribute("msg","your data has been submitted successfully");
			return "createcontract";
		}
		else
		{
			return "createcontract";

		}
	}
	@RequestMapping("/list")    
    public String viewlist(Model m){    
        List<CreateContract> list=dao2.listAll();    
        m.addAttribute("list",list);  
        return "listofcontracts";    
    }   
	@RequestMapping("/manage")
	public String  Manage() {
		return "managedelivery";
	}
	@RequestMapping("/feedback")    
    public String viewfeed(){    
        return "feedback";    
    }
}
