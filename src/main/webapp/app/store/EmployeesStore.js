Ext.define('Employees.store.EmployeesStore', {
	extend: 'Ext.data.Store',
	requires : [
		'Employees.model.EmployeesModel'
	],
	model: 'Employees.model.EmployeesModel',

	autoLoad: true,
	autoSync: true,
	proxy: {
		type: 'rest',
		api: {
			read: 'employees',
		},
		reader: {
			type: 'json',
			root: 'data',
			successProperty: 'success'
		},
		writer: {
			type: 'json',
			writeAllFields: true
		}

	}
});