Feature: search by country code and state code
Scenario: user calls webservices to get the details of the state
Given countryCode "USA" and stateCode "NC"
When a user go to "http://services.groupkt.com/state/get/{countryCode}/{stateCode}"
Then GroupKT the satus code is 200
And GroupKT response includes "RestResponse.result.country" is "USA"


