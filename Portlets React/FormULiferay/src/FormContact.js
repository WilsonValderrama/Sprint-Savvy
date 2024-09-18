import React, { useState } from 'react';


const FormContact = () => {

    const [formData, setFormData] = useState({
        documentType: '',
        documentNumber: '',
        name: '',
        lastName: '',
        mail: '',
        phoneNumber: '',
        academicProgram: ''
    });

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });

        // Verifica si el input tiene contenido y ajusta la clase del span hermano
        if (value.trim() !== "") {
            e.target.classList.add('has-content');
        } else {
            e.target.classList.remove('has-content');
        }
    };

    const handleFormSubmit = (e) => {
        e.preventDefault();
        handleCreateContact();
    };


    const handleCreateContact = async () => {
        try {
            const response = await Liferay.Service('/contact_us.contact/create-contact', {
                documentType: formData.documentType,
                documentNumber: formData.documentNumber,
                name: formData.name,
                lastName: formData.lastName,
                mail: formData.mail,
                phoneNumber: formData.phoneNumber,
                academicProgram: formData.academicProgram
            },);
            console.log(response);
            // recargar la página
            window.location.reload();

        } catch (error) {
            console.error('Error al crear contacto:', error);
        }
    }

    return (


        <div className="contact-container">
            <div className="contact-container-form">
                <form className="form" onSubmit={handleFormSubmit}>
                    <p className="title">Universidad Uliferay</p>
                    <p className="message">
                        Descubre tu camino hacia el conocimiento en Uliferay. Nuestro dedicado equipo está listo para
                        guiarte a
                        través del emocionante proceso de inscripción, admisión y matrícula, personalizando cada paso para
                        que
                        tu viaje académico sea excepcional. ¡Comparte tus datos y comencemos esta increíble travesía juntos!
                    </p>

                    <label>
                        <select
                            name="documentType"
                            value={formData.documentType}
                            onChange={handleInputChange}
                            required=""
                            className="input">
                            <option value="" disabled selected>Tipo de documento*</option>
                            <option value="CC">Cédula de ciudadanía</option>
                            <option value="CE">Cédula de extranjería</option>
                            <option value="TI">Tarjeta de identidad</option>
                        </select>
                    </label>

                    <label>
                        <input
                            name="documentNumber"
                            value={formData.documentNumber}
                            onChange={handleInputChange}
                            required=""
                            placeholder=""
                            type="text"
                            className="input"
                        />
                        <span>Número de documento*</span>
                    </label>

                    <div className="flex">
                        <label>
                            <input
                                name="name"
                                value={formData.name}
                                onChange={handleInputChange}
                                required=""
                                placeholder=""
                                type="text"
                                className="input" />
                            <span>Nombres*</span>
                        </label>

                        <label>
                            <input
                                name="lastName"
                                value={formData.lastName}
                                onChange={handleInputChange}
                                required=""
                                placeholder=""
                                type="text"
                                className="input" />
                            <span>Apellidos*</span>
                        </label>
                    </div>

                    <label>
                        <input
                            name="mail"
                            value={formData.mail}
                            onChange={handleInputChange}
                            required=""
                            placeholder=""
                            type="email"
                            className="input" />
                        <span>Correo electrónico*</span>
                    </label>

                    <label>
                        <input
                            name="phoneNumber"
                            value={formData.phoneNumber}
                            onChange={handleInputChange}
                            required=""
                            placeholder=""
                            type="tel"
                            className="input" />
                        <span>Número de teléfono celular*</span>
                    </label>

                    <label>
                        <select
                            name="academicProgram"
                            value={formData.academicProgram}
                            onChange={handleInputChange}
                            required=""
                            className="input">
                            <option value="" disabled selected>Programa académico de interés*</option>
                            <option value="1">Desarrolo Full Stack</option>
                            <option value="2">Desarrollo Frontend</option>
                            <option value="3">Desarrollo Backend</option>
                        </select>
                    </label>

                    <label className="accept-terms">
                        <input type="checkbox" required="" />
                        <p>Acepto la Política de Privacidad de la Universidad Uliferay.*</p>
                    </label>

                    <button className="submit">Enviar</button>

                    <p className="signin">
                        ¿Ya tienes una cuenta? <a href="http://localhost:8080/c/portal/logout">Inicia sesión</a>
                    </p>
                </form>
            </div>
            <div className="contact-container-map">
                <iframe
                    src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3976.498430107299!2d-74.0548846262114!3d4.68308769529184!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e3f9babe0f44da3%3A0xfc3d1e679f72f57c!2sPeriferia%20IT%20Group!5e0!3m2!1ses-419!2sbr!4v1706660771521!5m2!1ses-419!2sbr"
                    allowfullscreen="" referrerpolicy="no-referrer-when-downgrade" title="Google Maps"></iframe>
            </div>
        </div>


    )
}

export default FormContact