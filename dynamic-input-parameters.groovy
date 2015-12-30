/*
Author: Isaac S Cohen
This script works with workflow to dynamically add parameters to an input
Use case: you may need to add parameters to an input based on certain conditions that are determined at runtime
*/
List<hudson.model.ParameterDefinition> listOfParameters=new ArrayList<hudson.model.ParameterDefinition>()
listOfParameters.add(new hudson.model.StringParameterDefinition('test',''))
listOfParameters.add(new hudson.model.ChoiceParameterDefinition('test2','a\nb\nc', 'description'))
def test = input message: 'Test Input Message?', parameters:listOfParameters
