/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template in the editor.
 *
 * @author kizomanizo@gmail.com
 */
public class AfyacareJSONParser {

    StringBuilder recordRow = new StringBuilder();
    String returnRecordRow = "";
    public String jsonToString(String jsonObjectAsString) {

        try {

            String messageTimestamp = "";
            String postOrUpdate = "";
            String uuid = "";
            String firstName = "";
            String middleName = "";
            String lastName = "";
            String otherName = "";
            String uln = "";
            String nationalId = "";
            String dlId = "";
            String nhifId = "";
            String ichfId = "";
            String ctcId = "";
            String tbId = "";
            String sex = "";
            String dob = "";
            String permanentRegion = "";
            String permanentCouncil = "";
            String permanentWard = "";
            String permanentVillage = "";
            String permanentHamlet = "";
            String placeOfBirth = "";
            String phonePrefix = "";
            String phoneSuffix = "";
            String familyLinkages = "";
            String otherLinkages = "";
            String placeEncountered = "";
            String clientStatus = "";

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
                                    case "messagetimestamp":
                                        messageTimestamp =  val;
                                        break;

                                    case "postorupdate":
                                        postOrUpdate = val;
                                        break;

                                    case "uuid":
                                        uuid = val;
                                        break;

                                    case "firstname":
                                        firstName = val;
                                        break;

                                    case "middlename":
                                        middleName = val;
                                        break;

                                    case "lastname":
                                        lastName = val;
                                        break;

                                    case "othername":
                                        otherName = val;
                                        break;

                                    case "uln":
                                        uln = val;
                                        break;

                                    case "nationalid":
                                        nationalId = val;
                                        break;

                                    case "dlid":
                                        dlId = val;
                                        break;

                                    case "nhifid":
                                        nhifId = val;
                                        break;

                                    case "ichfid":
                                        ichfId = val;
                                        break;

                                    case "ctcid":
                                        ctcId = val;
                                        break;

                                    case "tbid":
                                        tbId = val;
                                        break;

                                    case "sex":
                                        sex = val;
                                        break;

                                    case "dob":
                                        dob = val;
                                        break;

                                    case "permanentregion":
                                        permanentRegion = val;
                                        break;

                                    case "permanentcouncil":
                                        permanentCouncil = val;
                                        break;

                                    case "permanentward":
                                        permanentWard = val;
                                        break;

                                    case "permanentvillage":
                                        permanentVillage = val;
                                        break;

                                    case "permanenthamlet":
                                        permanentHamlet = val;
                                        break;

                                    case "placeOfbirth":
                                        placeOfBirth = val;
                                        break;

                                    case "phoneprefix":
                                        phonePrefix = val;
                                        break;

                                    case "phonesuffix":
                                        phoneSuffix = val;
                                        break;

                                    case "familylinkages":
                                        familyLinkages = val;
                                        break;

                                    case "otherlinkages":
                                        otherLinkages = val;
                                        break;

                                    case "placeencountered":
                                        placeEncountered = val;
                                        break;

                                    case "clientstatus":
                                        clientStatus = val;
                                        break;

                                    default:
                                        // NHCR FTW
                                        break;
                                }
                            }
                        }

                        recordRow.append("Mirembe MHH")
                            .append("|").append("AfyaCare Registered Clients")
                            .append("|").append("AfyaCare EMR")
                            .append("|").append(messageTimestamp)
                            .append("|").append(postOrUpdate)
                            .append("|").append("NHCR")
                            .append("|").append(uuid)
                            .append("|").append(firstName)
                            .append("|").append(middleName)
                            .append("|").append(lastName)
                            .append("|").append(otherName)
                            .append("|").append(sex)
                            .append("|").append(dob)
                            .append("|").append(permanentRegion)
                            .append("|").append(permanentCouncil)
                            .append("|").append(permanentWard)
                            .append("|").append(permanentVillage)
                            .append("|").append(permanentHamlet)
                            .append("|").append(clientStatus)
                            .append("|").append(phonePrefix)
                            .append("|").append(phoneSuffix)
                            .append("|").append(familyLinkages)
                            .append("|").append(otherLinkages)
                            .append("|").append(placeEncountered)
                            .append("|").append(placeOfBirth)
                            .append("|").append(uln)
                            .append("|").append(nationalId)
                            .append("|").append(dlId)
                            .append("|").append(nhifId)
                            .append("|").append(ichfId)
                            .append("|").append(ctcId)
                            .append("|").append(tbId);

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