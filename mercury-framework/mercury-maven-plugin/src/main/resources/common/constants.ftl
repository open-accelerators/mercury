package ${packageName};

public final class ${className} {

  public static final String DOMAIN_NAME = "${domainName}";

  // Message Channels
  public static final String CHANNEL_${domainNameUpperCase} = DOMAIN_NAME;
<#list services as service>
  public static final String ${service.channelName} = "${service.channelId}";  
</#list>
  
  private ${className}() {}
}