#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

#This will act as @BeforeTest tag
  Background:
  	Given User has opened website in chrome
    And user enters username and password
  
  Scenario: Login
    
    When I select oneway
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

Scenario Outline: Dropdown Selection
	When user selects <country> from to port
	
	Examples:
	
	|country|
	|Paris|   
	
	Scenario Outline: AirfLine Preferece Selection
	When user selects <airlines> from AirfLine Preferece
	
	Examples:
	
	|airlines|
	|Pangea Airlines| 
	