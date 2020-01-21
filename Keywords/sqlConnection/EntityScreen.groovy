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

public class EntityScreen {

	@Keyword
	public connection(String url, String user, String password, String driverClassName){

		def sqlConnection = Sql.newInstance(url, user, password, driverClassName)

		println "********************************************** DB connection is established ****************************************"

		sqlConnection.eachRow("SELECT top 10 edt.[edt_name],edt.[edt_short_nm],[sts].[sts_status_desc],etp.[etp_typ_desc],est.[est_ent_tax_sts_desc] AS edt_tax_status,fcm.[fcm_for_curr_desc],amt.[amt_desc] AS Acctng_method,coa.[coa_chart_of_accts_desc],edd.[edd_desc] AS due_Diligence,ifm.[csp_cusip] AS Fund_Cusip FROM [crm].[edt_ent_tbl] edt INNER JOIN [crm].[sts_status] sts ON edt.[sts_row_id] = sts.[sts_row_id]INNER JOIN [crm].[etp_ent_typ] etp ON edt.[etp_row_id] = etp.[etp_row_id]LEFT JOIN [dbo].[est_ent_tax_sts] est ON edt.[est_row_id] = est.[est_row_id]LEFT JOIN [dbo].[fcm_for_curr_mstr] fcm ON edt.[fcm_row_id] = fcm.[fcm_row_id]LEFT JOIN [dbo].[amt_acctng_mthd_typ] amt ON edt.[amt_row_id] = amt.[amt_row_id]LEFT JOIN [gl].[coa_chart_of_accts] coa ON edt.[coa_row_id] = coa.[coa_row_id]LEFT JOIN [crm].[edd_ent_desc] edd ON edt.[edd_row_id] = edd.[edd_row_id]LEFT JOIN [dbo].[ifm_inv_fund_mstr] ifm ON edt.[edt_row_id] = ifm.[edt_row_id]ORDER BY edt.[CreateDate] desc") { r ->
			println ([
				r.edt_name,
				r.edt_short_nm,
				r.sts_status_desc,
				r.etp_typ_desc,
				r.edt_tax_status,
				r.fcm_for_curr_desc,
				r.Acctng_method,
				r.coa_chart_of_accts_desc,
				r.due_Diligence,
				r.Fund_Cusip
			])
		}

		sqlConnection.close()

		println "************************************************ DB Connection closed ************************************************ "
	}
}

