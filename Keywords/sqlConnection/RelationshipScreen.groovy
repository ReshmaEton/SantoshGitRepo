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

public class RelationshipScreen {

	@Keyword
	public connection(String url, String user, String password, String driverClassName){

		def sqlConnection = Sql.newInstance(url, user, password, driverClassName)

		println "********************************************** DB connection is established ****************************************"

		sqlConnection.eachRow("SELECT top 10 rdt.[rdt_name],rdt.[rdt_desc],rtp.[rtp_typ_desc],sts.[sts_status_desc]FROM crm.[rdt_rel_tbl] rdt INNER JOIN [crm].[rtp_rel_type] rtp ON rdt.[rtp_row_id] = rtp.[rtp_row_id]INNER JOIN [crm].[sts_status] sts ON rdt.[sts_row_id] = sts.[sts_row_id]ORDER BY rdt.[CreateDate] desc") { r ->
			println ([
				r.rdt_name,
				r.rdt_desc,
				r.rtp_typ_desc,
				r.sts_status_desc,
			])
		}

		sqlConnection.close()

		println "************************************************ DB Connection closed ************************************************ "
	}
}

