Ext.define('Employees.view.EmployeesView', {
	extend: 'Ext.panel.Panel',
	width: 500,
	height: 360,
	padding: 10,
	alias: 'widget.employeesView',
	layout: 'border',
	items: [
		{
			xtype: 'employeesGridView',
			region: 'center'
		},
		{
			xtype: 'panel',
			html: '<div style="font: normal 18px cursive"><center><font size = "10">Employees</font></center></div>',
			region: 'north',
			height: 80
		}
	],
	renderTo: Ext.getBody()
});