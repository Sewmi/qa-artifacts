# README

# Description
This sample was created to test usage of Iterate/aggregate mediator
This artifact is tested with wso2ei-6.0.0

# How to deploy

1. Start EI server
2. Copy 'verfication-api.xml' to wso2ei-6.0.0/repository/deployment/server/synapse-configs/default/api/ folder
3. Copy test.xml to wso2ei-6.0.0/repository/deployment/server/synapse-configs/default/proxy-services/ folder
4. You should be able to see the artifact deployment logs in the console/wso2carbon.log file.

# Request Payload
Request payload
```sh
  <items>
    <item>
      <id>order1-item1</id>
    </item>
    <item>
      <id>order1-item2</id>
    </item>
    <item>
      <id>order1-item3</id>
    </item>
  </items>
```

# Response Payload

```sh
<verified-order xmlns="http://ws.apache.org/ns/synapse">
    <verified-item xmlns="">
        <id>order1-item1</id>
    </verified-item>
    <verified-item xmlns="">
        <id>order1-item3</id>
    </verified-item>
    <verified-item xmlns="">
        <id>order1-item2</id>
    </verified-item>
</verified-order>
```

# Notes
 In aggregate mediator 'onComplete' block message get aggregated as specified using 'enclosingElementProperty' and 'expression'. When using the aggregated payload, always process (send to an endpoint, transform payload etc.) it outside the aggregated mediator.
