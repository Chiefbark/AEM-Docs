# Checkbox Example

Basic Checkbox example for your components.

## Usage

- Download both files `.content.xml` and `CheckboxController.java`
- Copy `.content.xml` inside the `_cq_dialog` folder
- Copy `CheckboxController.java` inside `core/.../models` and write the package at the top of the file
- Add an `.html` file to see some output or use this template:
	```
	<sly data-sly-use.checkbox="com.<project>.core.models.CheckboxController"/>
	<p>value: ${checkbox.value}</p>
	```
- Push the code to your server instance and you are ready to go!

## Docs

You can see all of the available fields for this component in the [Adobe Docs](https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/reference-materials/granite-ui/api/jcr_root/libs/granite/ui/components/coral/foundation/form/checkbox/index.html).