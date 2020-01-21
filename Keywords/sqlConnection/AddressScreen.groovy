package sqlConnection

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import groovy.sql.Sql
import java.sql.*

public class AddressScreen {

	@Keyword
	public connection(String url, String user, String password, String driverClassName){

		def sqlConnection = Sql.newInstance(url, user, password, driverClassName)

		println "********************************************** DB connection is established ****************************************"

		sqlConnection.eachRow("SELECT top 10 acd.[acd_acct_num],[acd].[acd_acct_nm],edt.[edt_name],[act].[act_typ_desc] AS acount_type,acs.[acs_cust_nm] AS Custodian,fcm.[fcm_for_curr_desc] AS Currency,sts.[sts_status_desc] AS Account_status,anh.[aas_acct_anh_sts_desc] AS ANH_Status,tcm.[tcm_tax_cst_meth_desc] AS Tax_Status,sec.[sec_sec_class_desc] AS sec_class,aac.[aac_acct_adv_cust_desc] AS Account_Advisor_Custody,[glm_eq].[ten_gla_acct_num]AS equity ,[glm_cash].[ten_gla_acct_num]AS Cash FROM [crm].[acd_acct_data] acd INNER JOIN [crm].[edt_ent_tbl] edt ON acd.[edt_row_id] = edt.[edt_row_id] LEFT JOIN [crm].[act_acct_typ] act ON acd.[act_row_id] = act.[act_row_id] LEFT JOIN [dbo].[acs_cust_tbl] acs ON acd.[acs_row_id] = acs.[acs_row_id]LEFT JOIN [dbo].[fcm_for_curr_mstr] fcm ON acd.[fcm_row_id] = fcm.[fcm_row_id]INNER JOIN [crm].[sts_status] sts ON acd.[sts_row_id] = sts.[sts_row_id]LEFT JOIN [crm].[aas_acct_anh_sts] anh ON acd.[aas_row_id] = anh.[aas_row_id]LEFT JOIN [dbo].[tcm_tax_cst_meth] tcm ON acd.[tcm_row_id] = tcm.[tcm_row_id]LEFT JOIN [dbo].[sec_sec_class] sec ON acd.[sec_row_id] = sec.[sec_row_id]LEFT JOIN [crm].[aac_acct_adv_cust] aac ON acd.[aac_row_id] = aac.[aac_row_id]LEFT JOIN gl.[glm_gen_ldgr_map] glm_eq ON acd.[acd_gl_equity] = [glm_eq].[glm_row_id]LEFT JOIN gl.[glm_gen_ldgr_map] glm_cash ON acd.[acd_gl_cash] = [glm_cash].[glm_row_id]ORDER BY acd.[CreateDate] DESC") 
{ r ->
			println ([
				r.acd_acct_num,
				r.acd_acct_nm,
				r.edt_name,
				r.acount_type,
				r.Custodian,
				r.Currency,
				r.Account_status,
				r.ANH_Status,
				r.Tax_Status,
				r.sec_class,
				r.Account_Advisor_Custody,
				r.equity,
				r.cash,
			
			])
		}

		sqlConnection.close()

		println "************************************************ DB Connection closed ************************************************ "
	}
}

