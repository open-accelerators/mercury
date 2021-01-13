
```
oc new-app java:8~https://github.com/rh-mercury/mercury-sd-camel --context-dir sd-customer-offer --name=sd-customer-offer 
--build-env=NEXUSREPO="<nexus-repo-url>" --build-env=AB_JOLOKIA_OFF=true
-eoc.project.path=<path to service>
-eeligibility.url=<eligibility_url>
-edirectory.url=<directory_url>
-edeployment.url=<deployment_url>
```
Build environment will need to be passed in with the URL for the nexus repo.

```
oc expose svc/sd-customer-offer
```

Swagger can be found at: ```{URL}/swagger-ui```

Sample Request for Initiate Offer
```

{ "data": {

		"customerOfferProcedureInitiateActionRecord": {},
		"customerOfferProcedureInstanceRecord": {
			"customerReference": "720996",
			"productServiceType": "e-wallet",
			"customerOfferProcessingTask": {
				"customerOfferProcessingTaskType": "esignaturere"
			}
		},
		"disclosureInstanceRecord": {
			"disclosureType": "signaturerequired",
			"disclosureTextDescription": "Acceptance of e-wallet terms",
			"documentReference": "DISCLOSURE-76560"
		},
		"customerOfferProcedureInstanceStatus": "string",
		"customerOfferServicingSessionReference": "COSSR738028",
		"productInitializationInstanceRecord": {
			"productInstanceReference": "string"
		}
	}
}

```
