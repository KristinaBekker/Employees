Ext.application({
	name: 'Employees',

	views: [
		'EmployeesGridView',
		'EmployeesView'
	],

	controllers : [
		'EmployeesController'
	],

	stores : [
		'EmployeesStore'
	],

	launch: function () {
		Ext.create('Ext.container.Viewport', {
			layout: 'fit',
			items: {
				xtype  : 'employeesView'
			}
		});
	}
});