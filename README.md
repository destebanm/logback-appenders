#Logback appenders for AWS

## AwsLogsAppender

Send logs to Amazon CloudWatch Logs.

Requirements:
 - Amazon IAM user with 'CloudWatchLogsFullAccess' (arn:aws:iam::aws:policy/CloudWatchLogsFullAccess) policy

Usage:

``` xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

	<appender name="AWS_LOGS" class="hu.bankmonitor.commons.logback.AwsLogsJsonAppender">
		<awsAccessKey>yourAwsAccessKey</awsAccessKey>
		<awsSecretKey>yourAwsSecretKey</awsSecretKey>
		<awsRegionName>region</awsRegionName>
		<logGroupName>log-group-name</logGroupName>
		<logStreamName>log-stream-name</logStreamName>
	</appender>

	<root level="DEBUG">
		<appender-ref ref="CONSOLE" />
		<appender-ref ref="AWS_LOGS" />
	</root>
	
</configuration>
```

Properties:

| Property      | Required  | Description                                        |
| :------------ | :-------: | :------------------------------------------------- |
| awsAccessKey  | yes       | AWS access key                                     |
| awsSecretKey  | yes       | AWS secret key                                     |
| awsRegionName | no        | CloudWatch region name. Default: US_WEST_2         |
| logGroupName  | no        | CloudWatch log group name. Default: log-group-name |
| logStreamName | no        | CloudWatch stream name. Default: log-stream-name   |
