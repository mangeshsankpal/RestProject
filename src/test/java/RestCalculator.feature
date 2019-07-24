Feature: Rest Calculator Appliaction
	
     	Scenario: Invoking Addition Service
		Given Rest Api "http://localhost:9090/addition?firstOperand=10&secondOperand=10"
		When invoking the given rest api
		Then expected result is 20		
