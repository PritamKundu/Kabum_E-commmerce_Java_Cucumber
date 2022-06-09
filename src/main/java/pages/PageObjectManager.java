package pages;

import org.openqa.selenium.WebDriver;
import pages.Accreditation.AccreditationInitialViewPage;
import pages.Assessment.AssessmentInitialViewPage;
import pages.Budget.*;
import pages.Credentialing.CredentialingPage;
import pages.LoginPage.LogInPage;

public class PageObjectManager {
	

	public WebDriver driver;

	public TestCRSPage testCRSPage;

	public LogInPage logInPage;

	public InitialViewPage initialViewPage;

	public AddNewBudgetAccountPage addNewBudgetAccountPage;

	public AddNewGlCodePage addNewGlCodePage;

	public BudgetApprovalPage budgetApprovalPage;

	public BudgetAttachmentPage budgetAttachmentPage;

	public BudgetHistoryPage budgetHistoryPage;

	public JiraTicketBudgetPage jiraTicketBudgetPage;

	public AssessmentInitialViewPage assessmentInitialViewPage;

	public AccreditationInitialViewPage accreditionInitialViewPage;

	public CredentialingPage credentialingPage;



	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	public TestCRSPage getTestCRSPage(){
		testCRSPage = new TestCRSPage(driver);
		return testCRSPage;
	}

	public LogInPage getLogInPage(){
		logInPage = new LogInPage(driver);
		return logInPage;
	}

	public InitialViewPage getInitialViewPage(){
		initialViewPage = new InitialViewPage(driver);
		return initialViewPage;
	}

	public AddNewBudgetAccountPage getAddNewBudgetAccountPage(){
		addNewBudgetAccountPage = new AddNewBudgetAccountPage(driver);
		return addNewBudgetAccountPage;
	}

	public AddNewGlCodePage getAddNewGLCodePage(){
		addNewGlCodePage = new AddNewGlCodePage(driver);
		return addNewGlCodePage;
	}
	public  BudgetApprovalPage getBudgetApprovalPage(){
		budgetApprovalPage = new BudgetApprovalPage(driver);
		return budgetApprovalPage;

	}
	public BudgetAttachmentPage getbudgetAttachmentPage(){
		budgetAttachmentPage = new BudgetAttachmentPage(driver);
		return budgetAttachmentPage;
	}
    public BudgetHistoryPage getBudgetHistoryPage(){
		budgetHistoryPage = new BudgetHistoryPage(driver);
		return budgetHistoryPage;
	}

	public JiraTicketBudgetPage getJiraTicketBudgetPage(){
		jiraTicketBudgetPage = new JiraTicketBudgetPage(driver);
		return jiraTicketBudgetPage;
	}

	public AssessmentInitialViewPage getAssessmentInitialViewPage(){
		assessmentInitialViewPage = new AssessmentInitialViewPage(driver);
		return assessmentInitialViewPage;
	}

	public AccreditationInitialViewPage getAccreditionInitialViewPage(){
		accreditionInitialViewPage = new AccreditationInitialViewPage(driver);
		return accreditionInitialViewPage;
	}

	public CredentialingPage getCredentialingPage(){
		credentialingPage = new CredentialingPage(driver);
		return credentialingPage;
	}
}
