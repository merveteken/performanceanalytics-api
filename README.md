# performanceanalytics-api
#saveMetrics API: "https://perfanalyticsapi.herokuapp.com/perfanalytics/saveMetrics"
    #saveMetrics api is used for saving the browser performance data (ttfb, domLoad, windowLoadEvent, fcp)
    
 #Sample Request: POST https://perfanalyticsapi.herokuapp.com/perfanalytics/saveMetrics
 #Request Body:
               {
              "id": "",
              "date":"2020-08-10",
              "domComplete":12121,
              "fcp":121,
              "ttfb":43344,
              "windowLoadEvent":1212
              }
 Response:

  {
    "id": 12,
    "date": "2020-08-10T00:00:00.000+00:00",
    "domComplete": 12121,
    "fcp": 121,
    "ttfb": 43344,
    "windowLoadEvent": 1212
}

#getMetrics API:  "https://perfanalyticsapi.herokuapp.com/perfanalytics/getMetrics"
    getMetrics api is used for getting data with filtered date.
    
    
Sample Request: GET https://perfanalyticsapi.herokuapp.com/perfanalytics/getMetrics?startDate=2020-07-07&endDate=2020-08-19
Response: 
[
    {
        "id": 7,
        "date": "2020-07-07",
        "domComplete": 2,
        "fcp": 3423,
        "ttfb": 12321,
        "windowLoadEvent": 213321
    },
    {
        "id": 8,
        "date": "2020-07-08",
        "domComplete": 2,
        "fcp": 3423,
        "ttfb": 12321,
        "windowLoadEvent": 213321
    },
    {
        "id": 9,
        "date": "2020-07-09",
        "domComplete": 2,
        "fcp": 3423,
        "ttfb": 12321,
        "windowLoadEvent": 213321
    },
    {
        "id": 10,
        "date": "2020-08-01",
        "domComplete": 2,
        "fcp": 3423,
        "ttfb": 12321,
        "windowLoadEvent": 213321
    },
    {
        "id": 11,
        "date": "2020-08-19",
        "domComplete": 3212,
        "fcp": 2133,
        "ttfb": 32232,
        "windowLoadEvent": 32443
    }
]
