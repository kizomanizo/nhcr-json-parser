/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template in the editor.
 *
 * @author kizomanizo@gmail.com
 */
public class AfyacareJSONParser {

    StringBuilder recordRow = new StringBuilder();
    String returnRecordRow = "";
        
    public String JSONtoTxt(String jsonObjectAsString) {

        try {

            String SendingFacility = "";
            String SendingApplication = "";
            String ReceivingApplication = "";
            String MessageTimestamp = "";
            String PostorUpdate = "";
            String uuid = "";
            String firstname = "";
            String middlename = "";
            String lastname = "";
            String othername = "";
            String uln = "";
            String national_id = "";
            String voter_id = "";
            String dl_id = "";
            String nhif_id = "";
            String ichf_id = "";
            String rita_id = "";
            String ctc_id = "";
            String tb_id = "";
            String sex = "";
            String dob = "";
            String region = "";
            String council = "";
            String ward = "";
            String village = "";
            String hamlet = "";
            String place_of_birth = "";
            String phone_prefix = "";
            String phone_suffix = "";
            String family_linkages = "";
            String other_linkages = "";
            String place_encountered = "";
            String status = "";

            jsonObjectAsString = jsonObjectAsString.replace("{\"clients\":[", "").replace("]}", "");
            jsonObjectAsString = jsonObjectAsString.replace("},{", "}{");
            final String[] curlyBracesObject = jsonObjectAsString.split("(?<=\\})(?=\\{)");

            if (curlyBracesObject.length > 0) {
                final String[] curlyBracesAsArray = curlyBracesObject;
                for (int curlyBracesArrayLength = curlyBracesAsArray.length, i = 0; i < curlyBracesArrayLength; ++i) {
                    final String[] noCurlyBracesObject = curlyBracesAsArray[i].replace("{", "").replace("}", "").split(",\"");
                    if (noCurlyBracesObject.length > 0) {
                        final String[] noCurlyBracesAsArray = noCurlyBracesObject;
                        for (int noCurlyBracesAsArrayLength = noCurlyBracesAsArray.length, j = 0; j < noCurlyBracesAsArrayLength; ++j) {
                            final String[] keyValuePair = noCurlyBracesAsArray[j].split(":", 2);
                            if (keyValuePair.length == 2) {
                                final String key = keyValuePair[0].replace("\"", "").toLowerCase();
                                final String val = keyValuePair[1].replace("\"", "");

                                switch (key) {
                                    case "SendingFacility":
                                        SendingFacility = val;
                                        break;

                                    case "SendingApplication":
                                        SendingApplication = val;
                                        break;

                                    case "ReceivingApplication":
                                        ReceivingApplication = val;
                                        break;

                                    case "MessageTimestamp":
                                        MessageTimestamp = val;
                                        break;

                                    case "PostorUpdate":
                                        PostorUpdate = val;
                                        break;

                                    case "uuid":
                                        uuid = val;
                                        break;

                                    case "firstname":
                                        firstname = val;
                                        break;

                                    case "middlename":
                                        middlename = val;
                                        break;

                                    case "lastname":
                                        lastname = val;
                                        break;

                                    case "othername":
                                        othername = val;
                                        break;

                                    case "uln":
                                        uln = val;
                                        break;

                                    case "national_id":
                                        national_id = val;
                                        break;

                                    case "voter_id":
                                        voter_id = val;
                                        break;

                                    case "dl_id":
                                        dl_id = val;
                                        break;

                                    case "nhif_id":
                                        nhif_id = val;
                                        break;

                                    case "ichf_id":
                                        ichf_id = val;
                                        break;

                                    case "rita_id":
                                        rita_id = val;
                                        break;

                                    case "ctc_id":
                                        ctc_id = val;
                                        break;

                                    case "tb_id":
                                        tb_id = val;
                                        break;

                                    case "sex":
                                        sex = val;
                                        break;

                                    case "dob":
                                        dob = val;
                                        break;

                                    case "region":
                                        region = val;
                                        break;

                                    case "council":
                                        council = val;
                                        break;

                                    case "ward":
                                        ward = val;
                                        break;

                                    case "village":
                                        village = val;
                                        break;

                                    case "hamlet":
                                        hamlet = val;
                                        break;

                                    case "place_of_birth":
                                        place_of_birth = val;
                                        break;

                                    case "phone_prefix":
                                        phone_prefix = val;
                                        break;

                                    case "phone_suffix":
                                        phone_suffix = val;
                                        break;

                                    case "family_linkages":
                                        family_linkages = val;
                                        break;

                                    case "other_linkages":
                                        other_linkages = val;
                                        break;

                                    case "place_encountered":
                                        place_encountered = val;
                                        break;

                                    case "status":
                                        status = val;
                                        break;
                                }
                            }
                        }

                        recordRow.append("")
                            .append("|").append("AfyaCare Client Identification")
                            .append("|").append(SendingFacility)
                            .append("|").append(SendingApplication)
                            .append("|").append(ReceivingApplication)
                            .append("|").append(MessageTimestamp)
                            .append("|").append(PostorUpdate)
                            .append("|").append(uuid)
                            .append("|").append(firstname)
                            .append("|").append(middlename)
                            .append("|").append(lastname)
                            .append("|").append(othername)
                            .append("|").append(uln)
                            .append("|").append(national_id)
                            .append("|").append(voter_id)
                            .append("|").append(dl_id)
                            .append("|").append(nhif_id)
                            .append("|").append(ichf_id)
                            .append("|").append(rita_id)
                            .append("|").append(ctc_id)
                            .append("|").append(tb_id)
                            .append("|").append(sex)
                            .append("|").append(dob)
                            .append("|").append(region)
                            .append("|").append(council)
                            .append("|").append(ward)
                            .append("|").append(village)
                            .append("|").append(hamlet)
                            .append("|").append(place_of_birth)
                            .append("|").append(phone_prefix)
                            .append("|").append(phone_suffix)
                            .append("|").append(family_linkages)
                            .append("|").append(other_linkages)
                            .append("|").append(place_encountered)
                            .append("|").append(status);

                        /* Add new line if there is another client in the array */
                        recordRow.append(System.getProperty("line.separator"));
                    }
                }
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
        returnRecordRow = recordRow.toString();
        return returnRecordRow;
    }
}
