package com.crm.qa.testcases;
import java.io.InputStreamReader;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;
import org.json.JSONTokener;

public class  JavarestApi {
    private static final String clientId = "3MVG9snqYUvtJB1PKIJxVBRpflRE0Q495wXobanO3kUm8cG2R1Ish36RELP0vMqJmOMYj3yJKFcagbj8Dd3Gi";
    private static final String clientSecret = "68DD54B01ABBC1FA27BA2578DD60D5A2476FA20472EB475192BBF9FD3ACB747B";
    private static final String redirectUrl = "https://localhost:8443/RestTest/oauth/_callback";
    private static String tokenUrl = "";
    private static final String environment = "https://test.salesforce.com";
    private static final String username = "deepika.joshi@sunrun.com.devmaj";
    private static final String password = "Welcome@2021";                   //passwordsecurity token

    private static String accessToken = "";
    private static String instanceUrl = "";

    public static void main(String ar[]) {
        System.out.println("----------getting a token---------");

        tokenUrl = environment + "/services/oauth2/token";
        System.out.println("tokenUrl    ........." + tokenUrl);
        HttpClient httpclient = new HttpClient();

        httpclient.getParams().setParameter(HttpClientParams.COOKIE_POLICY, CookiePolicy.BROWSER_COMPATIBILITY);

        PostMethod post = new PostMethod(tokenUrl);
        post.addParameter("grant_type", "password");
        post.addParameter("client_id", clientId);
        post.addParameter("client_secret", clientSecret);
        post.addParameter("username", username);
        post.addParameter("password", password);

        try {
            httpclient.executeMethod(post);
            JSONObject authResponse = new JSONObject(new JSONTokener(new InputStreamReader(post.getResponseBodyAsStream())));
            System.out.println("Auth Response :-" + authResponse.toString(2));

            accessToken = authResponse.getString("access_token");
            instanceUrl = authResponse.getString("instance_url");

            System.out.println("Got Access Token " + accessToken);
            System.out.println("Got Instance Url " + instanceUrl);


            new JavarestApi().createLead(instanceUrl, accessToken);

        } catch (Exception e) {
            System.out.println("Exception during Connect" + e);
        }
    }

    private String createLead(String instanceUrl, String accessToken) throws Exception {
        System.out.println("----------start lead--------");
        HttpClient httpclient = new HttpClient();
        JSONObject lead = new JSONObject();
        String leadId = "";
        String prospectId = "";

        try {
            lead.put("customerFirstName", "Kbc");
            lead.put("customerLastName", "Kbc");
            lead.put("customerStreet", "32840 S Folklore Loop");
            lead.put("customerFullAddress", "32840 S Folklore Loop, Union City, CA 94587");
            lead.put("janUsage", "900");
            lead.put("febUsage", "900");
            lead.put("marUsage", "900");
            lead.put("aprUsage", "900");
            lead.put("mayUsage", "900");
            lead.put("junUsage", "900");
            lead.put("julUsage", "900");
            lead.put("augUsage", "900");
            lead.put("sepUsage", "900");
            lead.put("octUsage", "900");
            lead.put("novUsage", "900");
            lead.put("decUsage", "900");
            lead.put("accountNumber", "");
            lead.put("additionalServices", "Energy Storage / Bright Box Battery;");
            lead.put("averageMonthlyElectricBill", "$351-400");
            lead.put("channel", "Self Gen");
            lead.put("customerCity", "Union City");
            lead.put("customerEmail", "sunrun@yopmail.com");
            lead.put("customerPrimaryPhone", "(801) 354-6513");
            lead.put("customerState", "CA");
            lead.put("customerZipCode", "94587");
            lead.put("hasHoa", "No");
            lead.put("homeSize", "");
            lead.put("homeType", "Detached single family home");
            lead.put("latitude", "38.554088");
            lead.put("longitude", "-121.4654132");
            lead.put("leadSource", "Sales Self Gen");
            lead.put("leadStage", "");
            lead.put("leadStatus", "");
            lead.put("memberId", "");
            lead.put("memberType", "");
            lead.put("meterNumber", "");
            lead.put("mobilePhone", "(801) 354-6513");
            lead.put("notes", "");
            lead.put("preferredLanguage", "English");
            lead.put("preferredLanguageContact", "");
            lead.put("purchasedThru", "Standard (Non-Retail)");
            lead.put("reason", "");
            lead.put("rentorOwn", "Own");
            lead.put("retailStoreLocation", "");
            lead.put("roofingType", "Comp Shingle");
            lead.put("sunrunCallConsent", "Yes");
            lead.put("utilityBillDate", "");
            lead.put("utilityServiceAddress", "");
            lead.put("costcoType", "");
            lead.put("isAnnualUsageAvailable", "true");
            lead.put("utilityCompany", "PG&E");
            lead.put("rateSchedule", "E-1");
            lead.put("leadType", "Rep Self Gen");
            lead.put("externalSource", "Sales Platform");
            lead.put("leadRep", "testsalesl1sr@test.sunrunhome.com");
            lead.put("salesRep", "testsalesl1sr@test.sunrunhome.com");
            //lead.put("salesRepEmail", "testsalesl1sr@test.sunrunhome.com");
            lead.put("cityName", "Union City");
            lead.put("cityType", "City");
            lead.put("countyName", "CA");
            lead.put("incorporationFlag", "yes");
            lead.put("townshipName", "Union City");
            lead.put("dncCoreLogicApi", "true");
            lead.put("coreLogicC2DStatus", "Failure");
            lead.put("coreLogicSpatialStatus", "Success");



            PostMethod post = new PostMethod(instanceUrl + "/services/apexrest/v2/leads?debug=true");
            post.setRequestHeader("Authorization", "Bearer " + accessToken);
            post.setRequestEntity(new StringRequestEntity(lead.toString(), "application/json", null));

            httpclient.executeMethod(post);
            System.out.println("HTTP status" + post.getStatusCode() + "creating lead\n\n");
            if (post.getStatusCode() == HttpStatus.SC_CREATED) {
                try {
                    JSONObject response = new JSONObject(new JSONTokener(new InputStreamReader(post.getResponseBodyAsStream())));
                    System.out.println("create response" + response.toString(2));
                    //if (response.getBoolean("success")) {
                    // leadId = response.getString("id");
                    prospectId = response.getString("prospectId");

                    // System.out.println("new record id:-" + leadId + "\n\n");
                    System.out.println("new record prospect id:-" + prospectId + "\n\n");
                    // }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
            System.out.println("----------end lead Creation--------\n\n");




            System.out.println("----------Start lead Conversion--------\n");
            try {
                lead = new JSONObject();
                lead.put("prospectQualified", "true");

                PostMethod patch = new PostMethod(instanceUrl + "/services/apexrest/v2/leads/"+prospectId + "?_HttpMethod=PATCH&debug=true");
                patch.setRequestHeader("Authorization", "Bearer " + accessToken);
                patch.setRequestEntity(new StringRequestEntity(lead.toString(),
                        "application/json", "UTF-8"));
                httpclient.executeMethod(patch);

                System.out.println("HTTP status" + patch.getStatusCode() + "converting lead\n\n");

                JSONObject response1 = new JSONObject(new JSONTokener(new InputStreamReader(patch.getResponseBodyAsStream())));
                System.out.println("create response" + response1);

            } catch (Exception e) {
                System.out.println(e);
            }


        System.out.println("----------Start Design Request Creation--------\n");
        try {

            lead = new JSONObject();
            lead.put("prospectQualified", "true");

            PostMethod post = new PostMethod(instanceUrl + "/services/apexrest/v2/designrequest/"+ prospectId);
            post.setRequestHeader("Authorization", "Bearer " + accessToken);
            post.setRequestEntity(new StringRequestEntity(lead.toString(),
                    "application/json", "UTF-8"));
            httpclient.executeMethod(post);

            System.out.println("HTTP status" + post.getStatusCode() + "creating Design Request lead\n\n");

            JSONObject response1 = new JSONObject(new JSONTokener(new InputStreamReader(post.getResponseBodyAsStream())));
            System.out.println("create response" + response1);



        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("----------end Design Request Creation--------\n\n");

        return prospectId;


        }

}
